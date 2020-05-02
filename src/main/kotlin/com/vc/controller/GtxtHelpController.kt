package com.vc.controller

import com.vc.event.GtxtAboutEvent
import com.vc.view.GtxtPopUp
import tornadofx.Controller

class GtxtHelpController : Controller() {
	init {
		subscribe<GtxtAboutEvent> { showAbout() }
	}

	private fun showAbout() {
		GtxtPopUp("Madness? This is GTXT!").invoke()
	}
}