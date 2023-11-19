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
package org.openmrs.module.kenyaemr.cashier.api.base.entity.model;

// @formatter:off
/**
 * Base class for {@link org.openmrs.OpenmrsMetadata} models that can be customized with simple attributes.
 * @param <TAttribute> The model attribute class.
 */
public abstract class BaseSimpleCustomizableData<TAttribute extends ISimpleAttribute<?, ?>>
		extends BaseCustomizableData<TAttribute>
		implements ISimpleCustomizable<TAttribute> {
// @formatter:on
	public static final long serialVersionUID = 0L;
}
