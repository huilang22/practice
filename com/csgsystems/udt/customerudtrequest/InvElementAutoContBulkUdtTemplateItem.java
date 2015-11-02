/*
 * Generated code DO NOT EDIT
 * Generated file: InvElementAutoContBulkUdtTemplateItem.java
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
 * Class used to create a InvElementAutoContBulkUdtTemplateItem Bulk Template
 *
 */

public class InvElementAutoContBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvElementObjFilter InvAutoContIn;
/**
 *
 * Constructor to create a  InvElementAutoContBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvElementAutoContBulkUdtTemplateItem(String id, BSDMSessionContext context, InvElementObjFilter InvAutoContInIn) {
    super(id, context, "InvElementAutoCont");
    InvAutoContIn = InvAutoContInIn;
  }

  public void translateToMap() {
    if (InvAutoContIn != null) {
      Integer index =  InvAutoContIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvElement", InvElementObjHelper.toMap(InvAutoContIn, new HashMap(), "InvElement").get("InvElement"));
    }
  }


/**
 *
 * Sets the InvElement
 * @param InvAutoContInIn Value of the InvAutoContIn
 *
 */

  public void setInvElement(InvElementObjFilter InvAutoContInIn) {
    InvAutoContIn = InvAutoContInIn;
  }

  public void translateFromMap() {
    InvAutoContIn = InvElementObjHelper.fromMapFilter(inputMap, "InvElement");
  }

/**
 *
 * Gets the InvElement
 * @return Value of the InvElement
 *
 */

  public InvElementObjFilter getInvElement( ) {
    return InvAutoContIn;
  }

}
