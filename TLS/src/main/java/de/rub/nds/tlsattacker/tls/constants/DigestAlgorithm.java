/**
 * TLS-Attacker - A Modular Penetration Testing Framework for TLS
 *
 * Copyright 2014-2016 Ruhr University Bochum / Hackmanit GmbH
 *
 * Licensed under Apache License 2.0
 * http://www.apache.org/licenses/LICENSE-2.0
 */
package de.rub.nds.tlsattacker.tls.constants;

/**
 * @author Juraj Somorovsky <juraj.somorovsky@rub.de>
 */
public enum DigestAlgorithm {

    LEGACY(""),
    SHA256("SHA-256"),
    SHA384("SHA-384");

    private DigestAlgorithm(String digestAlgorithm) {
	this.javaName = digestAlgorithm;
    }

    private final String javaName;

    public String getJavaName() {
	return javaName;
    }
}
