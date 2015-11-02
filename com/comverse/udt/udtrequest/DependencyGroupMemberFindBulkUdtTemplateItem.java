/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DependencyGroupMemberFindBulkUdtTemplateItem.java
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
 * Class used to create a DependencyGroupMemberFindBulkUdtTemplateItem Bulk Template
 *
 */

public class DependencyGroupMemberFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected DependencyGroupMemberObjectFilter entTypeGrpFindIn;
/**
 *
 * Constructor to create a  DependencyGroupMemberFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public DependencyGroupMemberFindBulkUdtTemplateItem(String id, BSDMSessionContext context, DependencyGroupMemberObjectFilter entTypeGrpFindInIn) {
    super(id, context, "DependencyGroupMemberFind");
    entTypeGrpFindIn = entTypeGrpFindInIn;
  }

  public void translateToMap() {
    if (entTypeGrpFindIn != null) {
      Integer index =  entTypeGrpFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("DependencyGroupMember", DependencyGroupMemberObjectHelper.toMap(entTypeGrpFindIn, new HashMap(), "DependencyGroupMember").get("DependencyGroupMember"));
    }
  }


/**
 *
 * Sets the DependencyGroupMember
 * @param entTypeGrpFindInIn Value of the entTypeGrpFindIn
 *
 */

  public void setDependencyGroupMember(DependencyGroupMemberObjectFilter entTypeGrpFindInIn) {
    entTypeGrpFindIn = entTypeGrpFindInIn;
  }

  public void translateFromMap() {
    entTypeGrpFindIn = DependencyGroupMemberObjectHelper.fromMapFilter(inputMap, "DependencyGroupMember");
  }

/**
 *
 * Gets the DependencyGroupMember
 * @return Value of the DependencyGroupMember
 *
 */

  public DependencyGroupMemberObjectFilter getDependencyGroupMember( ) {
    return entTypeGrpFindIn;
  }

}
