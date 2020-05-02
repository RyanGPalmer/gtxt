package com.vc.controller

import com.vc.event.GtxtSettingsEvent
import com.vc.view.GtxtPopUp
import tornadofx.Controller

class GtxtSettingsController : Controller() {
	init {
		subscribe<GtxtSettingsEvent> { openSettings() }
	}

	private fun openSettings() {
		GtxtPopUp("Edit Settings").invoke()
	}
}