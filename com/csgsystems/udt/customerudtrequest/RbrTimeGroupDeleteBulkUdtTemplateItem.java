/*
 * Generated code DO NOT EDIT
 * Generated file: RbrTimeGroupDeleteBulkUdtTemplateItem.java
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
 * Class used to create a RbrTimeGroupDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class RbrTimeGroupDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RbrTmGrpObjectKeyData RbrTmGrpDeleteIn;
/**
 *
 * Constructor to create a  RbrTimeGroupDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RbrTimeGroupDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, RbrTmGrpObjectKeyData RbrTmGrpDeleteInIn) {
    super(id, context, "RbrTimeGroupDelete");
    RbrTmGrpDeleteIn = RbrTmGrpDeleteInIn;
  }

  public void translateToMap() {
    if (RbrTmGrpDeleteIn != null) {
      RbrTmGrpDeleteIn.resetFlags(true, true);
      addInput("RbrTimeGroup", RbrTmGrpObjectKeyHelper.toMap(RbrTmGrpDeleteIn, new HashMap(), "RbrTmGrpObjectKeyData").get("RbrTmGrpObjectKeyData"));
    }
  }


/**
 *
 * Sets the RbrTimeGroup
 * @param RbrTmGrpDeleteInIn Value of the RbrTmGrpDeleteIn
 *
 */

  public void setRbrTimeGroup(RbrTmGrpObjectKeyData RbrTmGrpDeleteInIn) {
    RbrTmGrpDeleteIn = RbrTmGrpDeleteInIn;
  }

  public void translateFromMap() {
    RbrTmGrpDeleteIn = RbrTmGrpObjectKeyHelper.fromMap(inputMap, "RbrTimeGroup");
  }

/**
 *
 * Gets the RbrTimeGroup
 * @return Value of the RbrTimeGroup
 *
 */

  public RbrTmGrpObjectKeyData getRbrTimeGroup( ) {
    return RbrTmGrpDeleteIn;
  }

}
