package com.vc.controller

import com.vc.event.GtxtCopyEvent
import com.vc.event.GtxtPasteEvent
import com.vc.view.GtxtPopUp
import tornadofx.Controller

class GtxtEditorController : Controller() {
	init {
		subscribe<GtxtCopyEvent> { copySelection() }
		subscribe<GtxtPasteEvent> { paste() }
	}

	private fun copySelection() {
		GtxtPopUp("Copy Text").invoke()
	}

	private fun paste() {
		GtxtPopUp("Paste Text").invoke()
	}
}