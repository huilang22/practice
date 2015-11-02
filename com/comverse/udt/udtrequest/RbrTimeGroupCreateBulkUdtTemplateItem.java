/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrTimeGroupCreateBulkUdtTemplateItem.java
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
 * Class used to create a RbrTimeGroupCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class RbrTimeGroupCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RbrTmGrpObjectData RbrTmGrpCreateIn;
/**
 *
 * Constructor to create a  RbrTimeGroupCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RbrTimeGroupCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, RbrTmGrpObjectData RbrTmGrpCreateInIn) {
    super(id, context, "RbrTimeGroupCreate");
    RbrTmGrpCreateIn = RbrTmGrpCreateInIn;
  }

  public void translateToMap() {
    if (RbrTmGrpCreateIn != null) {
      RbrTmGrpCreateIn.resetFlags(true, true);
      addInput("RbrTimeGroup", RbrTmGrpObjectHelper.toMap(RbrTmGrpCreateIn, new HashMap(), "RbrTimeGroup").get("RbrTimeGroup"));
    }
  }


/**
 *
 * Sets the RbrTimeGroup
 * @param RbrTmGrpCreateInIn Value of the RbrTmGrpCreateIn
 *
 */

  public void setRbrTimeGroup(RbrTmGrpObjectData RbrTmGrpCreateInIn) {
    RbrTmGrpCreateIn = RbrTmGrpCreateInIn;
  }

  public void translateFromMap() {
    RbrTmGrpCreateIn = RbrTmGrpObjectHelper.fromMap(inputMap, "RbrTimeGroup");
  }

/**
 *
 * Gets the RbrTimeGroup
 * @return Value of the RbrTimeGroup
 *
 */

  public RbrTmGrpObjectData getRbrTimeGroup( ) {
    return RbrTmGrpCreateIn;
  }

}
