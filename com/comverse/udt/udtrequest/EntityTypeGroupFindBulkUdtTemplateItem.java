/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EntityTypeGroupFindBulkUdtTemplateItem.java
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
 * Class used to create a EntityTypeGroupFindBulkUdtTemplateItem Bulk Template
 *
 */

public class EntityTypeGroupFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected EntityTypeGroupObjectFilter EntityTypeGRPFindIn;
/**
 *
 * Constructor to create a  EntityTypeGroupFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public EntityTypeGroupFindBulkUdtTemplateItem(String id, BSDMSessionContext context, EntityTypeGroupObjectFilter EntityTypeGRPFindInIn) {
    super(id, context, "EntityTypeGroupFind");
    EntityTypeGRPFindIn = EntityTypeGRPFindInIn;
  }

  public void translateToMap() {
    if (EntityTypeGRPFindIn != null) {
      Integer index =  EntityTypeGRPFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("EntityTypeGroup", EntityTypeGroupObjectHelper.toMap(EntityTypeGRPFindIn, new HashMap(), "EntityTypeGroup").get("EntityTypeGroup"));
    }
  }


/**
 *
 * Sets the EntityTypeGroup
 * @param EntityTypeGRPFindInIn Value of the EntityTypeGRPFindIn
 *
 */

  public void setEntityTypeGroup(EntityTypeGroupObjectFilter EntityTypeGRPFindInIn) {
    EntityTypeGRPFindIn = EntityTypeGRPFindInIn;
  }

  public void translateFromMap() {
    EntityTypeGRPFindIn = EntityTypeGroupObjectHelper.fromMapFilter(inputMap, "EntityTypeGroup");
  }

/**
 *
 * Gets the EntityTypeGroup
 * @return Value of the EntityTypeGroup
 *
 */

  public EntityTypeGroupObjectFilter getEntityTypeGroup( ) {
    return EntityTypeGRPFindIn;
  }

}
