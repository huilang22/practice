/*
 * Generated code DO NOT EDIT
 * Generated file: EntityTypeGroupGetBulkUdtTemplateItem.java
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
 * Class used to create a EntityTypeGroupGetBulkUdtTemplateItem Bulk Template
 *
 */

public class EntityTypeGroupGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected EntityTypeGroupObjectKeyData EntityTypeGRPGetIn;
/**
 *
 * Constructor to create a  EntityTypeGroupGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public EntityTypeGroupGetBulkUdtTemplateItem(String id, BSDMSessionContext context, EntityTypeGroupObjectKeyData EntityTypeGRPGetInIn) {
    super(id, context, "EntityTypeGroupGet");
    EntityTypeGRPGetIn = EntityTypeGRPGetInIn;
  }

  public void translateToMap() {
    if (EntityTypeGRPGetIn != null) {
      EntityTypeGRPGetIn.resetFlags(true, true);
      addInput("EntityTypeGroup", EntityTypeGroupObjectKeyHelper.toMap(EntityTypeGRPGetIn, new HashMap(), "EntityTypeGroupObjectKeyData").get("EntityTypeGroupObjectKeyData"));
    }
  }


/**
 *
 * Sets the EntityTypeGroup
 * @param EntityTypeGRPGetInIn Value of the EntityTypeGRPGetIn
 *
 */

  public void setEntityTypeGroup(EntityTypeGroupObjectKeyData EntityTypeGRPGetInIn) {
    EntityTypeGRPGetIn = EntityTypeGRPGetInIn;
  }

  public void translateFromMap() {
    EntityTypeGRPGetIn = EntityTypeGroupObjectKeyHelper.fromMap(inputMap, "EntityTypeGroup");
  }

/**
 *
 * Gets the EntityTypeGroup
 * @return Value of the EntityTypeGroup
 *
 */

  public EntityTypeGroupObjectKeyData getEntityTypeGroup( ) {
    return EntityTypeGRPGetIn;
  }

}
