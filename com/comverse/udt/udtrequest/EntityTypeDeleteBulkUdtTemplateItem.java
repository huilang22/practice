/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EntityTypeDeleteBulkUdtTemplateItem.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

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
 * Class used to create a EntityTypeDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class EntityTypeDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected EntityTypeObjectKeyData EntityTypeDeleteIn;
/**
 *
 * Constructor to create a  EntityTypeDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public EntityTypeDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, EntityTypeObjectKeyData EntityTypeDeleteInIn) {
    super(id, context, "EntityTypeDelete");
    EntityTypeDeleteIn = EntityTypeDeleteInIn;
  }

  public void translateToMap() {
    if (EntityTypeDeleteIn != null) {
      EntityTypeDeleteIn.resetFlags(true, true);
      addInput("EntityType", EntityTypeObjectKeyHelper.toMap(EntityTypeDeleteIn, new HashMap(), "EntityTypeObjectKeyData").get("EntityTypeObjectKeyData"));
    }
  }


/**
 *
 * Sets the EntityType
 * @param EntityTypeDeleteInIn Value of the EntityTypeDeleteIn
 *
 */

  public void setEntityType(EntityTypeObjectKeyData EntityTypeDeleteInIn) {
    EntityTypeDeleteIn = EntityTypeDeleteInIn;
  }

  public void translateFromMap() {
    EntityTypeDeleteIn = EntityTypeObjectKeyHelper.fromMap(inputMap, "EntityType");
  }

/**
 *
 * Gets the EntityType
 * @return Value of the EntityType
 *
 */

  public EntityTypeObjectKeyData getEntityType( ) {
    return EntityTypeDeleteIn;
  }

}
