{
  // ===========================
  // Layout & Workbench
  // ===========================
  "workbench.sideBar.location": "left",
  "workbench.panel.defaultLocation": "right",
  "workbench.statusBar.visible": true,
  "workbench.startupEditor": "none",
  "workbench.editor.empty.hint": "hidden",
  "window.menuBarVisibility": "compact",
  "breadcrumbs.enabled": true,
  "workbench.activityBar.location": "left",

  // ===========================
  // Explorer (KEEP LINES)
  // ===========================
  "explorer.compactFolders": false,
  "workbench.tree.renderIndentGuides": "always",
  "workbench.tree.indent": 10,

  // ===========================
  // Editor (Clean but Complete)
  // ===========================
  "editor.fontFamily": "JetBrains Mono, Fira Code, Consolas, monospace",
  "editor.fontLigatures": true,
  "editor.fontSize": 15,
  "editor.lineHeight": 24,

  // KEEP code lines
  "editor.lineNumbers": "on",

  "editor.renderWhitespace": "selection",
  "editor.renderLineHighlight": "line",
  "editor.minimap.enabled": false,
  "editor.scrollBeyondLastLine": false,
  "editor.smoothScrolling": true,

  "editor.cursorStyle": "line",
  "editor.cursorBlinking": "smooth",

  // Brackets & guides (professional default)
  "editor.bracketPairColorization.enabled": true,
  "editor.guides.bracketPairs": true,

  "editor.hover.delay": 300,
  "editor.parameterHints.enabled": false,
  "editor.lightbulb.enabled": "off",
  "editor.inlineSuggest.showToolbar": "always",

  // ===========================
  // Formatting & Productivity
  // ===========================
  "editor.formatOnSave": true,
  "editor.formatOnPaste": true,
  "editor.tabSize": 2,
  "editor.insertSpaces": true,
  "files.autoSave": "onFocusChange",

  "editor.defaultFormatter": "esbenp.prettier-vscode",

  "[javascript]": {
    "editor.formatOnSave": true
  },
  "[typescript]": {
    "editor.formatOnSave": true
  },
  "[json]": {
    "editor.formatOnSave": true
  },

  "javascript.updateImportsOnFileMove.enabled": "always",

  // ===========================
  // Terminal (Right Panel)
  // ===========================
  "terminal.integrated.defaultProfile.windows": "PowerShell",
  "terminal.integrated.fontSize": 13,
  "terminal.integrated.cursorStyle": "line",
  "terminal.integrated.cursorBlinking": true,
  "terminal.integrated.scrollback": 4000,
  "terminal.integrated.tabs.enabled": false,

  // ===========================
  // Theme & Colors
  // ===========================
  "workbench.colorTheme": "Carbonfox",
  "workbench.iconTheme": "vscode-icons-mac",
  "workbench.colorCustomizations": {
    "terminal.background": "#0E0E0E",
    "terminal.foreground": "#C5C5C5"
  },

  // ===========================
  // Files & Search
  // ===========================
  "files.exclude": {
    "**/.git": true,
    "**/node_modules": true,
    "**/dist": true,
    "**/build": true
  },
  "search.exclude": {
    "**/node_modules": true,
    "**/dist": true,
    "**/build": true
  },

  // ===========================
  // Privacy
  // ===========================
  "telemetry.telemetryLevel": "off",
  "jdk.telemetry.enabled": false
}
