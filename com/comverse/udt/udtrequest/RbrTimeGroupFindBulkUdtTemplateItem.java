/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrTimeGroupFindBulkUdtTemplateItem.java
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
 * Class used to create a RbrTimeGroupFindBulkUdtTemplateItem Bulk Template
 *
 */

public class RbrTimeGroupFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RbrTmGrpObjectFilter RbrTmGrpFindIn;
/**
 *
 * Constructor to create a  RbrTimeGroupFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RbrTimeGroupFindBulkUdtTemplateItem(String id, BSDMSessionContext context, RbrTmGrpObjectFilter RbrTmGrpFindInIn) {
    super(id, context, "RbrTimeGroupFind");
    RbrTmGrpFindIn = RbrTmGrpFindInIn;
  }

  public void translateToMap() {
    if (RbrTmGrpFindIn != null) {
      Integer index =  RbrTmGrpFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("RbrTimeGroup", RbrTmGrpObjectHelper.toMap(RbrTmGrpFindIn, new HashMap(), "RbrTimeGroup").get("RbrTimeGroup"));
    }
  }


/**
 *
 * Sets the RbrTimeGroup
 * @param RbrTmGrpFindInIn Value of the RbrTmGrpFindIn
 *
 */

  public void setRbrTimeGroup(RbrTmGrpObjectFilter RbrTmGrpFindInIn) {
    RbrTmGrpFindIn = RbrTmGrpFindInIn;
  }

  public void translateFromMap() {
    RbrTmGrpFindIn = RbrTmGrpObjectHelper.fromMapFilter(inputMap, "RbrTimeGroup");
  }

/**
 *
 * Gets the RbrTimeGroup
 * @return Value of the RbrTimeGroup
 *
 */

  public RbrTmGrpObjectFilter getRbrTimeGroup( ) {
    return RbrTmGrpFindIn;
  }

}
