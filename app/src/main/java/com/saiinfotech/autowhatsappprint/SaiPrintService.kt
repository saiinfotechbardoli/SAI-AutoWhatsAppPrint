package com.saiinfotech.autowhatsappprint

import android.print.PrintJob
import android.printservice.PrintService

class SaiPrintService : PrintService() {

    override fun onPrintJobQueued(printJob: PrintJob) {
        printJob.fail("SAI capture engine is not installed yet")
    }

    override fun onRequestCancelPrintJob(printJob: PrintJob) {
        printJob.cancel()
    }
}
