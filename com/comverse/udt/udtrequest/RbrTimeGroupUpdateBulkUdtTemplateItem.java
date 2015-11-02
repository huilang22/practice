/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrTimeGroupUpdateBulkUdtTemplateItem.java
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
 * Class used to create a RbrTimeGroupUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class RbrTimeGroupUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RbrTmGrpObjectData RbrTmGrpUpdateIn;
/**
 *
 * Constructor to create a  RbrTimeGroupUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RbrTimeGroupUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, RbrTmGrpObjectData RbrTmGrpUpdateInIn) {
    super(id, context, "RbrTimeGroupUpdate");
    RbrTmGrpUpdateIn = RbrTmGrpUpdateInIn;
  }

  public void translateToMap() {
    if (RbrTmGrpUpdateIn != null) {
      RbrTmGrpUpdateIn.resetFlags(true, true);
      addInput("RbrTimeGroup", RbrTmGrpObjectHelper.toMap(RbrTmGrpUpdateIn, new HashMap(), "RbrTimeGroup").get("RbrTimeGroup"));
    }
  }


/**
 *
 * Sets the RbrTimeGroup
 * @param RbrTmGrpUpdateInIn Value of the RbrTmGrpUpdateIn
 *
 */

  public void setRbrTimeGroup(RbrTmGrpObjectData RbrTmGrpUpdateInIn) {
    RbrTmGrpUpdateIn = RbrTmGrpUpdateInIn;
  }

  public void translateFromMap() {
    RbrTmGrpUpdateIn = RbrTmGrpObjectHelper.fromMap(inputMap, "RbrTimeGroup");
  }

/**
 *
 * Gets the RbrTimeGroup
 * @return Value of the RbrTimeGroup
 *
 */

  public RbrTmGrpObjectData getRbrTimeGroup( ) {
    return RbrTmGrpUpdateIn;
  }

}
