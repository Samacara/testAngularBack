package recuperer.donnees.codeBarre.Service;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.async.DeferredResult;
import recuperer.donnees.codeBarre.Event.KeyPressEvent;

@Component
public class BarcodeScannerListener {

    private DeferredResult<String> deferredResult;

    @EventListener
    public void handleKeyPress(KeyPressEvent event) {
        if (deferredResult != null) {
            deferredResult.setResult(event.getCodeBarre());
            deferredResult = null;
        }
    }

    public DeferredResult<String> onScan() {
        deferredResult = new DeferredResult<>();
        return deferredResult;
    }
}
