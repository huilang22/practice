/*
 * Generated code DO NOT EDIT
 * Generated file: InvsMncFindBulkUdtTemplateItem.java
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
 * Class used to create a InvsMncFindBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsMncFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsMncObjectFilter InvsMncFindIn;
/**
 *
 * Constructor to create a  InvsMncFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsMncFindBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsMncObjectFilter InvsMncFindInIn) {
    super(id, context, "InvsMncFind");
    InvsMncFindIn = InvsMncFindInIn;
  }

  public void translateToMap() {
    if (InvsMncFindIn != null) {
      Integer index =  InvsMncFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsMnc", InvsMncObjectHelper.toMap(InvsMncFindIn, new HashMap(), "InvsMnc").get("InvsMnc"));
    }
  }


/**
 *
 * Sets the InvsMnc
 * @param InvsMncFindInIn Value of the InvsMncFindIn
 *
 */

  public void setInvsMnc(InvsMncObjectFilter InvsMncFindInIn) {
    InvsMncFindIn = InvsMncFindInIn;
  }

  public void translateFromMap() {
    InvsMncFindIn = InvsMncObjectHelper.fromMapFilter(inputMap, "InvsMnc");
  }

/**
 *
 * Gets the InvsMnc
 * @return Value of the InvsMnc
 *
 */

  public InvsMncObjectFilter getInvsMnc( ) {
    return InvsMncFindIn;
  }

}
