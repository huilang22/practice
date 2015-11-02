/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EntityTypeUpdateBulkUdtTemplateItem.java
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
 * Class used to create a EntityTypeUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class EntityTypeUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected EntityTypeObjectData EntityTypeUpdateIn;
/**
 *
 * Constructor to create a  EntityTypeUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public EntityTypeUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, EntityTypeObjectData EntityTypeUpdateInIn) {
    super(id, context, "EntityTypeUpdate");
    EntityTypeUpdateIn = EntityTypeUpdateInIn;
  }

  public void translateToMap() {
    if (EntityTypeUpdateIn != null) {
      EntityTypeUpdateIn.resetFlags(true, true);
      addInput("EntityType", EntityTypeObjectHelper.toMap(EntityTypeUpdateIn, new HashMap(), "EntityType").get("EntityType"));
    }
  }


/**
 *
 * Sets the EntityType
 * @param EntityTypeUpdateInIn Value of the EntityTypeUpdateIn
 *
 */

  public void setEntityType(EntityTypeObjectData EntityTypeUpdateInIn) {
    EntityTypeUpdateIn = EntityTypeUpdateInIn;
  }

  public void translateFromMap() {
    EntityTypeUpdateIn = EntityTypeObjectHelper.fromMap(inputMap, "EntityType");
  }

/**
 *
 * Gets the EntityType
 * @return Value of the EntityType
 *
 */

  public EntityTypeObjectData getEntityType( ) {
    return EntityTypeUpdateIn;
  }

}
