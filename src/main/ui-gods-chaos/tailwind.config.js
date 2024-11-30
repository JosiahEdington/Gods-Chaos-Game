/** @type {import('tailwindcss').Config} */
module.exports = {
  content: ["./src/index.html", "./src/**/*.{html,ts}"],
  theme: {
    extend: {
      colors: {
          'egyptian': {100: '#F8CD24'},
          'norse': { 100:'#5DEF9A' },
          'greek': { 100:'#8EEEFC' },
          'modern': { 100:'#DC5C3C' },
          'star-five': { 100:'#D2962D' },
          'star-six': { 100:'#EB594C' },
          'chatroom-background': { 100:'#f4f2f1' }, 
          'chatroom-foreground': { 100:'#EFD3BB' }, 
          'chatroom-header': { 100:'#534947' }, 
        },
      }
    },
  plugins: [],
}

