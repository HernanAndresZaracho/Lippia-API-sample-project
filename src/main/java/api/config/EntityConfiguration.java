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
    TIME_CONSULT{
        @Override
        public Class<?> getEntityService() {
            return TimeConsultService.class;
        }
    },
    TIME_DELETE{
        @Override
        public Class<?> getEntityService() {
            return TimeDeleteService.class;
        }
    },
    TIME_ADD{
        @Override
        public Class<?> getEntityService() {
            return TimeAddService.class;
        }
    },
    TIME_UPDATE{
        @Override
        public Class<?> getEntityService() {
            return TimeUpdateService.class;
        }
    },
    ERROR {
        @Override
        public Class<?> getEntityService() {
            return ErrorService.class;
        }
    },
    ERRORID {
        @Override
        public Class<?> getEntityService() {
            return ErrorIdService.class;
        }
    };

    public abstract Class<?> getEntityService();
}
