/*******************************************************************************
  * Copyright (c) 2007-2009 Red Hat, Inc.
  * Distributed under license by Red Hat, Inc. All rights reserved.
  * This program is made available under the terms of the
  * Eclipse Public License v1.0 which accompanies this distribution,
  * and is available at http://www.eclipse.org/legal/epl-v10.html
  *
  * Contributor:
  *     Red Hat, Inc. - initial API and implementation
  ******************************************************************************/
package test.annotated.fields;

import java.util.HashSet;
import java.util.Set;

public class FotoXPerson {

	protected Integer ffotoId;

	protected PersonXFoto person;
	
	protected Set<PersonXFoto> persons = new HashSet<PersonXFoto>(0);

}
