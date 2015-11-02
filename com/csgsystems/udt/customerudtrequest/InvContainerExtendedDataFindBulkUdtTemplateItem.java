/*
 * Generated code DO NOT EDIT
 * Generated file: InvContainerExtendedDataFindBulkUdtTemplateItem.java
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
 * Class used to create a InvContainerExtendedDataFindBulkUdtTemplateItem Bulk Template
 *
 */

public class InvContainerExtendedDataFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvContainerObjectKeyData InvContEdIn;
/**
 *
 * Constructor to create a  InvContainerExtendedDataFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvContainerExtendedDataFindBulkUdtTemplateItem(String id, BSDMSessionContext context, InvContainerObjectKeyData InvContEdInIn) {
    super(id, context, "InvContainerExtendedDataFind");
    InvContEdIn = InvContEdInIn;
  }

  public void translateToMap() {
    if (InvContEdIn != null) {
      InvContEdIn.resetFlags(true, true);
      addInput("InvContainer", InvContainerObjectKeyHelper.toMap(InvContEdIn, new HashMap(), "InvContainerObjectKeyData").get("InvContainerObjectKeyData"));
    }
  }


/**
 *
 * Sets the InvContainer
 * @param InvContEdInIn Value of the InvContEdIn
 *
 */

  public void setInvContainer(InvContainerObjectKeyData InvContEdInIn) {
    InvContEdIn = InvContEdInIn;
  }

  public void translateFromMap() {
    InvContEdIn = InvContainerObjectKeyHelper.fromMap(inputMap, "InvContainer");
  }

/**
 *
 * Gets the InvContainer
 * @return Value of the InvContainer
 *
 */

  public InvContainerObjectKeyData getInvContainer( ) {
    return InvContEdIn;
  }

}
