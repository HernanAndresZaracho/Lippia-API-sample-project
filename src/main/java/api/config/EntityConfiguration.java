package api.config;

import services.*;

public enum EntityConfiguration {

    USER {
        @Override
        public Class<?> getEntityService() {
            return UserService.class;
        }

    },
    RESPONSE_HEADERS {
        @Override
        public Class<?> getEntityService() {
            return ResponseHeadersService.class;
        }
    },
    WORKSPACE {
        @Override
        public Class<?> getEntityService() {
            return WorkspaceService.class;
        }
    },
    PROJECT {
        @Override
        public Class<?> getEntityService() {
            return ProjectService.class;
        }
    },
    PROJECTID {
        @Override
        public Class<?> getEntityService() {
            return ProjectIdService.class;
        }
    },
    ERROR {
        @Override
        public Class<?> getEntityService() {
            return ErrorService.class;
        }
    },
    ERROR401 {
        @Override
        public Class<?> getEntityService() {
            return Error404Service.class;
        }
    },
    ERROR404 {
        @Override
        public Class<?> getEntityService() {
            return Error404Service.class;
        }
    },
    PROJECTADD {
        @Override
        public Class<?> getEntityService() {
            return ProjectAddService.class;
        }
    },
    PROJECTUPDATE{
      @Override
      public Class<?> getEntityService(){
          return ProjectUpdateService.class;
      }
    };

    public abstract Class<?> getEntityService();
}
