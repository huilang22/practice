/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EntityTypeGroupMemberFindBulkUdtTemplateItem.java
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
 * Class used to create a EntityTypeGroupMemberFindBulkUdtTemplateItem Bulk Template
 *
 */

public class EntityTypeGroupMemberFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected EntityTypeGroupMemberObjectFilter entTypeGrpFindIn;
/**
 *
 * Constructor to create a  EntityTypeGroupMemberFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public EntityTypeGroupMemberFindBulkUdtTemplateItem(String id, BSDMSessionContext context, EntityTypeGroupMemberObjectFilter entTypeGrpFindInIn) {
    super(id, context, "EntityTypeGroupMemberFind");
    entTypeGrpFindIn = entTypeGrpFindInIn;
  }

  public void translateToMap() {
    if (entTypeGrpFindIn != null) {
      Integer index =  entTypeGrpFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("EntityTypeGroupMember", EntityTypeGroupMemberObjectHelper.toMap(entTypeGrpFindIn, new HashMap(), "EntityTypeGroupMember").get("EntityTypeGroupMember"));
    }
  }


/**
 *
 * Sets the EntityTypeGroupMember
 * @param entTypeGrpFindInIn Value of the entTypeGrpFindIn
 *
 */

  public void setEntityTypeGroupMember(EntityTypeGroupMemberObjectFilter entTypeGrpFindInIn) {
    entTypeGrpFindIn = entTypeGrpFindInIn;
  }

  public void translateFromMap() {
    entTypeGrpFindIn = EntityTypeGroupMemberObjectHelper.fromMapFilter(inputMap, "EntityTypeGroupMember");
  }

/**
 *
 * Gets the EntityTypeGroupMember
 * @return Value of the EntityTypeGroupMember
 *
 */

  public EntityTypeGroupMemberObjectFilter getEntityTypeGroupMember( ) {
    return entTypeGrpFindIn;
  }

}
