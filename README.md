# shadow-playground

```bash
npx shadow-cljs compile functions && node target/functions/index.js

```

=>

```
shadow-cljs - config: /Users/mitkuijp/Development/shadow-playground-contents/shadow-cljs.edn
[:functions] Compiling ...
[:functions] Build completed. (58 files, 0 compiled, 0 warnings, 0,79s)
shadow-cljs - failed to load module$node_modules$agentkeepalive$lib$agent
Module not provided: shadow.esm.esm_import$process
shadow-cljs - failed to load module$node_modules$agentkeepalive$index
Module not provided: shadow.esm.esm_import$process

node:internal/modules/run_main:123
    triggerUncaughtException(
    ^
Module not provided: shadow.esm.esm_import$process
(Use `node --trace-uncaught ...` to show where the exception was thrown)

Node.js v20.19.2
```

