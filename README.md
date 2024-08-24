keycloak.auth-server-url=http://localhost:7980
keycloak.realm=liyun-dev
keycloak.resource=org-service
keycloak.principal-attribute=preferred_username
keycloak.bearer-only=true
keycloak.credentials.secret=CNbn0f3Ftid68wXWMAJBJgTjJptt2ot9

在使用的client里面，的service account,需授予对应ream的manage-users,view-users，和query-users角色
