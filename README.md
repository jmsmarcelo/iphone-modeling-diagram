# Desafio DIO
Trilha, **Desenvolvimento Java com IA**
### Modelando o iPhone com UML
Desafio, modelar e criar um diagrama UML do iPhone, abrangendo suas funcionalidades.

## Funcionalidades
1. **Telefone**
   - Ligar, Atender, Iniciar Correio de Voz
2. **Navegador da Internet**
   - Exibir Página, Adicionar Nova Aba, Atualizar Página
3. **Reprodutor Musical**
   - Tocar, Pausar, Selecionar Música

## Diagrama UML
```mermaid
classDiagram
  class iPhone {
  }
  class apple.Phone {
    +call()
    +listen()
    +startVoiceMail()
  }
  class apple.WebBrowser {
    +viewPage(String url)
    +addNewTab()
    +updatePage()
  }
  class MusicPlayer {
    +setMusic(String music)
    +play()
    +pause()
  }

  iPhone --> apple.Phone
  iPhone --> apple.WebBrowser
  iPhone --> MusicPlayer
```
