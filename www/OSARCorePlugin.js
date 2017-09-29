var exec = require('cordova/exec');

exports.open = function(success, fail) {
	exec(success, fail, 'OSARCorePlugin', 'open', []);
}
