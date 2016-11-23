package com.devopsbuddy.exceptions;

import com.stripe.exception.APIConnectionException;

/**
 * Created by andrewburns on 11/22/16.
 */
public class StripeException extends RuntimeException {
    public StripeException(Throwable e) {
        super(e);
    }
}
