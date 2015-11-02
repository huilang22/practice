/*
 * Generated code DO NOT EDIT
 * Generated file: RbrProcedureDeleteBulkUdtTemplateItem.java
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
 * Class used to create a RbrProcedureDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class RbrProcedureDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RbrProcObjectKeyData RbrProcDeleteIn;
/**
 *
 * Constructor to create a  RbrProcedureDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RbrProcedureDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, RbrProcObjectKeyData RbrProcDeleteInIn) {
    super(id, context, "RbrProcedureDelete");
    RbrProcDeleteIn = RbrProcDeleteInIn;
  }

  public void translateToMap() {
    if (RbrProcDeleteIn != null) {
      RbrProcDeleteIn.resetFlags(true, true);
      addInput("RbrProcedure", RbrProcObjectKeyHelper.toMap(RbrProcDeleteIn, new HashMap(), "RbrProcObjectKeyData").get("RbrProcObjectKeyData"));
    }
  }


/**
 *
 * Sets the RbrProcedure
 * @param RbrProcDeleteInIn Value of the RbrProcDeleteIn
 *
 */

  public void setRbrProcedure(RbrProcObjectKeyData RbrProcDeleteInIn) {
    RbrProcDeleteIn = RbrProcDeleteInIn;
  }

  public void translateFromMap() {
    RbrProcDeleteIn = RbrProcObjectKeyHelper.fromMap(inputMap, "RbrProcedure");
  }

/**
 *
 * Gets the RbrProcedure
 * @return Value of the RbrProcedure
 *
 */

  public RbrProcObjectKeyData getRbrProcedure( ) {
    return RbrProcDeleteIn;
  }

}
