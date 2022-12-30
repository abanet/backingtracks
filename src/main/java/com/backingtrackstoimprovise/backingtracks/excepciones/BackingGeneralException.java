package com.backingtrackstoimprovise.backingtracks.excepciones;

public class BackingGeneralException extends RuntimeException {

        private static final long serialVersionUID = 1L;

        public BackingGeneralException(String errorMessage) {
            super(errorMessage);
        }

        public BackingGeneralException(String errorMessage, Throwable err) {
            super(errorMessage,err);
        }
    }

