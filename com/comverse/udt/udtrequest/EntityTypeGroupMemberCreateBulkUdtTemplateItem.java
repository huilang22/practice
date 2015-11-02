/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EntityTypeGroupMemberCreateBulkUdtTemplateItem.java
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
 * Class used to create a EntityTypeGroupMemberCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class EntityTypeGroupMemberCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected EntityTypeGroupMemberObjectData entTypeGrpCrIn;
/**
 *
 * Constructor to create a  EntityTypeGroupMemberCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public EntityTypeGroupMemberCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, EntityTypeGroupMemberObjectData entTypeGrpCrInIn) {
    super(id, context, "EntityTypeGroupMemberCreate");
    entTypeGrpCrIn = entTypeGrpCrInIn;
  }

  public void translateToMap() {
    if (entTypeGrpCrIn != null) {
      entTypeGrpCrIn.resetFlags(true, true);
      addInput("EntityTypeGroupMember", EntityTypeGroupMemberObjectHelper.toMap(entTypeGrpCrIn, new HashMap(), "EntityTypeGroupMember").get("EntityTypeGroupMember"));
    }
  }


/**
 *
 * Sets the EntityTypeGroupMember
 * @param entTypeGrpCrInIn Value of the entTypeGrpCrIn
 *
 */

  public void setEntityTypeGroupMember(EntityTypeGroupMemberObjectData entTypeGrpCrInIn) {
    entTypeGrpCrIn = entTypeGrpCrInIn;
  }

  public void translateFromMap() {
    entTypeGrpCrIn = EntityTypeGroupMemberObjectHelper.fromMap(inputMap, "EntityTypeGroupMember");
  }

/**
 *
 * Gets the EntityTypeGroupMember
 * @return Value of the EntityTypeGroupMember
 *
 */

  public EntityTypeGroupMemberObjectData getEntityTypeGroupMember( ) {
    return entTypeGrpCrIn;
  }

}
