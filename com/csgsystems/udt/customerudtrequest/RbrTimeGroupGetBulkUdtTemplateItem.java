/*
 * Generated code DO NOT EDIT
 * Generated file: RbrTimeGroupGetBulkUdtTemplateItem.java
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
 * Class used to create a RbrTimeGroupGetBulkUdtTemplateItem Bulk Template
 *
 */

public class RbrTimeGroupGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RbrTmGrpObjectKeyData RbrTmGrpGetIn;
/**
 *
 * Constructor to create a  RbrTimeGroupGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RbrTimeGroupGetBulkUdtTemplateItem(String id, BSDMSessionContext context, RbrTmGrpObjectKeyData RbrTmGrpGetInIn) {
    super(id, context, "RbrTimeGroupGet");
    RbrTmGrpGetIn = RbrTmGrpGetInIn;
  }

  public void translateToMap() {
    if (RbrTmGrpGetIn != null) {
      RbrTmGrpGetIn.resetFlags(true, true);
      addInput("RbrTimeGroup", RbrTmGrpObjectKeyHelper.toMap(RbrTmGrpGetIn, new HashMap(), "RbrTmGrpObjectKeyData").get("RbrTmGrpObjectKeyData"));
    }
  }


/**
 *
 * Sets the RbrTimeGroup
 * @param RbrTmGrpGetInIn Value of the RbrTmGrpGetIn
 *
 */

  public void setRbrTimeGroup(RbrTmGrpObjectKeyData RbrTmGrpGetInIn) {
    RbrTmGrpGetIn = RbrTmGrpGetInIn;
  }

  public void translateFromMap() {
    RbrTmGrpGetIn = RbrTmGrpObjectKeyHelper.fromMap(inputMap, "RbrTimeGroup");
  }

/**
 *
 * Gets the RbrTimeGroup
 * @return Value of the RbrTimeGroup
 *
 */

  public RbrTmGrpObjectKeyData getRbrTimeGroup( ) {
    return RbrTmGrpGetIn;
  }

}
