package com.vc.event

import tornadofx.EventBus
import tornadofx.FXEvent

open class GtxtEvent : FXEvent(EventBus.RunOn.ApplicationThread)