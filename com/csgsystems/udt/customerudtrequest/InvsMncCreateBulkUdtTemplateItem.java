/*
 * Generated code DO NOT EDIT
 * Generated file: InvsMncCreateBulkUdtTemplateItem.java
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
import com.csgsystems.iv.data.*;

/**
 *
 * Class used to create a InvsMncCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsMncCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsMncObjectData InvsMncCreateIn;
/**
 *
 * Constructor to create a  InvsMncCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsMncCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsMncObjectData InvsMncCreateInIn) {
    super(id, context, "InvsMncCreate");
    InvsMncCreateIn = InvsMncCreateInIn;
  }

  public void translateToMap() {
    if (InvsMncCreateIn != null) {
      InvsMncCreateIn.resetFlags(true, true);
      addInput("InvsMnc", InvsMncObjectHelper.toMap(InvsMncCreateIn, new HashMap(), "InvsMnc").get("InvsMnc"));
    }
  }


/**
 *
 * Sets the InvsMnc
 * @param InvsMncCreateInIn Value of the InvsMncCreateIn
 *
 */

  public void setInvsMnc(InvsMncObjectData InvsMncCreateInIn) {
    InvsMncCreateIn = InvsMncCreateInIn;
  }

  public void translateFromMap() {
    InvsMncCreateIn = InvsMncObjectHelper.fromMap(inputMap, "InvsMnc");
  }

/**
 *
 * Gets the InvsMnc
 * @return Value of the InvsMnc
 *
 */

  public InvsMncObjectData getInvsMnc( ) {
    return InvsMncCreateIn;
  }

}
