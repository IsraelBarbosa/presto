(function () {
  'use strict';

  var $form = document.querySelector('.form');
  var $password = document.querySelector('#password');
  var $labelRePassword = document.querySelector('[for=rePassword]');
  var $rePassword = document.querySelector('#rePassword');
  var $formButton = document.querySelector('.form-button');
  var $formProgress = document.querySelector('.form-progress');
  var textContentPassword = '';
  var textContentRePassword = '';

  $password.addEventListener('blur', function (event) {
    var $this = this;

    textContentPassword = $this.value;

    if (textContentPassword == '' && !document.querySelector('[data-error=passwordClear]')) {
      var $error = document.createElement('span');

      $error.classList.add('msgError');
      $error.setAttribute('data-error', 'passwordClear');
      $error.textContent = 'Please, fill the password';
      $form.insertBefore($error, $labelRePassword);

      $this.classList.add('error');
    };
  });

  $password.addEventListener('keyup', function (event) {
    var $this = this;
    var $errorPasswordClear = document.querySelector('[data-error=passwordClear]');
    var $errorNoMatch = document.querySelector('[data-error=notMatch]');
    var $minEightLetters = /[a-zA-Z0-9]{8,}/;
    textContentPassword = $this.value;
    textContentRePassword = $rePassword.value;

    if ($this.value != '' && $errorPasswordClear) {
      document.querySelector('[data-error=passwordClear]').remove();
      $this.classList.remove('error');
    } else if (textContentPassword == textContentRePassword && $errorNoMatch) {
      document.querySelector('[data-error=notMatch]').remove();
    };

    if ($minEightLetters.test(textContentPassword)) {
      $formProgress.value = 10;
      $formProgress.textContent = 10;
    } else {
      $formProgress.value = 0;
      $formProgress.textContent = 0;
    };
  });


  $rePassword.addEventListener('blur', function () {
    var $this = this;
    textContentRePassword = $this.value;

    if (textContentRePassword == '' && !document.querySelector('[data-error=rePasswordClear]')) {
      var $error = document.createElement('span');

      $error.classList.add('msgError');
      $error.setAttribute('data-error', 'rePasswordClear');
      $error.textContent = 'Please, fill the Re-password';
      $form.insertBefore($error, $formButton);

      $this.classList.add('error');
    } else if (textContentPassword != textContentRePassword && !document.querySelector('[data-error=notMatch]')) {
      var $error = document.createElement('span');

      $error.classList.add('msgError');
      $error.setAttribute('data-error', 'notMatch');
      $error.textContent = 'Password and Re-password does not match';
      $form.insertBefore($error, $formButton);

      $this.classList.add('error');
    };

    $rePassword.addEventListener('keyup', function (event) {
      var $this = this;
      var $errorPasswordClear = document.querySelector('[data-error=rePasswordClear]');
      var $errorNoMatch = document.querySelector('[data-error=notMatch]');
      textContentPassword = $password.value;
      textContentRePassword = $this.value;

      if ($this.value != '' && $errorPasswordClear) {
        document.querySelector('[data-error=rePasswordClear]').remove();
        $this.classList.remove('error');
      } else if (textContentPassword == textContentRePassword && $errorNoMatch) {
        document.querySelector('[data-error=notMatch]').remove();
      };
    });
  });
})();
