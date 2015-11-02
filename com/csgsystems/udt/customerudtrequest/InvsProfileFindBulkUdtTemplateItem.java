/*
 * Generated code DO NOT EDIT
 * Generated file: InvsProfileFindBulkUdtTemplateItem.java
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
 * Class used to create a InvsProfileFindBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsProfileFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsProfileObjectFilter InvsProfileFindIn;
/**
 *
 * Constructor to create a  InvsProfileFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsProfileFindBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsProfileObjectFilter InvsProfileFindInIn) {
    super(id, context, "InvsProfileFind");
    InvsProfileFindIn = InvsProfileFindInIn;
  }

  public void translateToMap() {
    if (InvsProfileFindIn != null) {
      Integer index =  InvsProfileFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsProfile", InvsProfileObjectHelper.toMap(InvsProfileFindIn, new HashMap(), "InvsProfile").get("InvsProfile"));
    }
  }


/**
 *
 * Sets the InvsProfile
 * @param InvsProfileFindInIn Value of the InvsProfileFindIn
 *
 */

  public void setInvsProfile(InvsProfileObjectFilter InvsProfileFindInIn) {
    InvsProfileFindIn = InvsProfileFindInIn;
  }

  public void translateFromMap() {
    InvsProfileFindIn = InvsProfileObjectHelper.fromMapFilter(inputMap, "InvsProfile");
  }

/**
 *
 * Gets the InvsProfile
 * @return Value of the InvsProfile
 *
 */

  public InvsProfileObjectFilter getInvsProfile( ) {
    return InvsProfileFindIn;
  }

}
