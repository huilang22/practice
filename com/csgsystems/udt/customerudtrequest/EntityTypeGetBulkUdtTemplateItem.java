/*
 * Generated code DO NOT EDIT
 * Generated file: EntityTypeGetBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.math.BigInteger;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;

import com.csgsystems.aruba.connection.BSDMSessionContext;
import com.csgsystems.cf.data.*;

/**
 *
 * Class used to create a EntityTypeGetBulkUdtTemplateItem Bulk Template
 *
 */

public class EntityTypeGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected EntityTypeObjectKeyData EntityTypeGetIn;
/**
 *
 * Constructor to create a  EntityTypeGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public EntityTypeGetBulkUdtTemplateItem(String id, BSDMSessionContext context, EntityTypeObjectKeyData EntityTypeGetInIn) {
    super(id, context, "EntityTypeGet");
    EntityTypeGetIn = EntityTypeGetInIn;
  }

  public void translateToMap() {
    if (EntityTypeGetIn != null) {
      EntityTypeGetIn.resetFlags(true, true);
      addInput("EntityType", EntityTypeObjectKeyHelper.toMap(EntityTypeGetIn, new HashMap(), "EntityTypeObjectKeyData").get("EntityTypeObjectKeyData"));
    }
  }


/**
 *
 * Sets the EntityType
 * @param EntityTypeGetInIn Value of the EntityTypeGetIn
 *
 */

  public void setEntityType(EntityTypeObjectKeyData EntityTypeGetInIn) {
    EntityTypeGetIn = EntityTypeGetInIn;
  }

  public void translateFromMap() {
    EntityTypeGetIn = EntityTypeObjectKeyHelper.fromMap(inputMap, "EntityType");
  }

/**
 *
 * Gets the EntityType
 * @return Value of the EntityType
 *
 */

  public EntityTypeObjectKeyData getEntityType( ) {
    return EntityTypeGetIn;
  }

}
