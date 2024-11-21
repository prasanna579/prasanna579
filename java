const messagesContainer = document.getElementById('messages');
const chatForm = document.getElementById('chat-form');
const messageInput = document.getElementById('message-input');

// Add a message to the chat
function addMessage(text, type = 'sent') {
  const messageDiv = document.createElement('div');
  messageDiv.className = message ${type};
  messageDiv.textContent = text;
  messagesContainer.appendChild(messageDiv);
  messagesContainer.scrollTop = messagesContainer.scrollHeight; // Scroll to the bottom
}

// Handle form submission
chatForm.addEventListener('submit', (e) => {
  e.preventDefault();
  const message = messageInput.value;
  if (message.trim() === '') return;

  addMessage(message, 'sent'); // Add user's message
  messageInput.value = ''; // Clear input

  // Simulate a received message
  setTimeout(() => {
    addMessage('This is a reply!', 'received');
  }, 1000);
});
