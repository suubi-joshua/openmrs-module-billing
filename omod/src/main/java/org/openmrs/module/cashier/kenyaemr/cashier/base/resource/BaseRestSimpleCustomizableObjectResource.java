/*
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.1 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.module.cashier.kenyaemr.cashier.base.resource;

import org.openmrs.OpenmrsObject;
import org.openmrs.module.kenyaemr.cashier.api.base.entity.model.ISimpleAttribute;
import org.openmrs.module.kenyaemr.cashier.api.base.entity.model.ISimpleCustomizable;

// @formatter:off
/**
 * REST resource for {@link org.openmrs.OpenmrsObject}
 * {@link org.openmrs.module.openhmis.commons.api.entity.model.ISimpleCustomizable}s.
 * @param <E> The simple customizable model class
 * @param <TAttribute> The model attribute class
 */
public abstract class BaseRestSimpleCustomizableObjectResource<
			E extends ISimpleCustomizable<TAttribute> & OpenmrsObject,
			TAttribute extends ISimpleAttribute<E, ?>>
		extends BaseRestCustomizableObjectResource<E, TAttribute> {
// @formatter:on
}
