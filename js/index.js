function rain() {
				var engine = new RainyDay('canvas','img', window.innerWidth, window.innerHeight);

 					engine.gravity = engine.GRAVITY_NON_LINEAR;

 					engine.trail = engine.TRAIL_DROPS;

 					engine.VARIABLE_GRAVITY_ANGLE = Math.PI / 8;

					engine.rain([

						engine.preset(0, 2, 0.5),

						engine.preset(4, 4, 1)

					], 50);

 }


