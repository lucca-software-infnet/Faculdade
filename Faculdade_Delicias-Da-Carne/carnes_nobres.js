document.addEventListener('DOMContentLoaded', function() {
  var carouselContainer = document.querySelector('.carousel-container');
  var carouselCards = document.querySelectorAll('.carousel-card');
  var prevButton = document.querySelector('.carousel-prev-card');
  var nextButton = document.querySelector('.carousel-next-card');
  var cardWidth = carouselCards[0].offsetWidth;
  var visibleCards = 3.8;
  var currentIndex = 0;

  function updateCarousel() {
    cardWidth = carouselCards[0].getBoundingClientRect().width;
    carouselContainer.style.transform = 'translateX(' + (-cardWidth * currentIndex) + 'px)';
  }

  function showCards(direction) {
    var increment = direction === 'next' ? 1.033 : -1.040;
    var newIndex = currentIndex + increment;

    if (newIndex >= 0 && newIndex <= carouselCards.length - visibleCards) {
      currentIndex = newIndex;
    } else if (newIndex < 0) {
      currentIndex = carouselCards.length - visibleCards;
    } else {
      currentIndex = 0;
    }

    updateCarousel();
  }

  nextButton.addEventListener('click', function() {
    showCards('next');
  });

  prevButton.addEventListener('click', function() {
    showCards('prev');
  });

  // Adicionar lógica para atualizar a visibilidade dos cards em diferentes tamanhos de tela
  function updateCardVisibility() {
    var windowWidth = window.innerWidth;


    if (windowWidth <= 1330){
      visibleCards = 0.7; 
      function showCards(direction) {
    var increment = direction === 'next' ? 0.001 : -0.001;
    var newIndex = currentIndex + increment;

    if (newIndex >= 0 && newIndex <= carouselCards.length - visibleCards) {
      currentIndex = newIndex;
    } else if (newIndex < 0) {
      currentIndex = carouselCards.length - visibleCards;
    } else {
      currentIndex = 0;
    }

    updateCarousel();
  }

  nextButton.addEventListener('click', function() {
    showCards('next');
  });

  prevButton.addEventListener('click', function() {
    showCards('prev');
  });
      
    } else if (windowWidth <= 1735) {
      visibleCards = 2.7; // Definir para 3 quando a largura for menor ou igual a 1735px
      function showCards(direction) {
    var increment = direction === 'next' ? 0.01 : -0.01;
    var newIndex = currentIndex + increment;

    if (newIndex >= 0 && newIndex <= carouselCards.length - visibleCards) {
      currentIndex = newIndex;
    } else if (newIndex < 0) {
      currentIndex = carouselCards.length - visibleCards;
    } else {
      currentIndex = 0;
    }

    updateCarousel();
  }

  nextButton.addEventListener('click', function() {
    showCards('next');
  });

  prevButton.addEventListener('click', function() {
    showCards('prev');
  });
    } else {
      visibleCards = 3.8; // Manter a configuração original para larguras maiores
    }
    updateCarousel(); // Atualizar o carrossel para refletir a nova configuração
  }

  // Chamar a função inicialmente para configurar a visibilidade correta
  updateCardVisibility();

  // Chamar a função sempre que a janela for redimensionada
  window.addEventListener('resize', updateCardVisibility);
});


