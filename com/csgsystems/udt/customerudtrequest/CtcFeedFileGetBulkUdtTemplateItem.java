/*
 * Generated code DO NOT EDIT
 * Generated file: CtcFeedFileGetBulkUdtTemplateItem.java
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
import com.csgsystems.ctc.data.*;

/**
 *
 * Class used to create a CtcFeedFileGetBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcFeedFileGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcFeedFileObjectKeyData GetIn;
/**
 *
 * Constructor to create a  CtcFeedFileGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcFeedFileGetBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcFeedFileObjectKeyData GetInIn) {
    super(id, context, "CtcFeedFileGet");
    GetIn = GetInIn;
  }

  public void translateToMap() {
    if (GetIn != null) {
      GetIn.resetFlags(true, true);
      addInput("CtcFeedFile", CtcFeedFileObjectKeyHelper.toMap(GetIn, new HashMap(), "CtcFeedFileObjectKeyData").get("CtcFeedFileObjectKeyData"));
    }
  }


/**
 *
 * Sets the CtcFeedFile
 * @param GetInIn Value of the GetIn
 *
 */

  public void setCtcFeedFile(CtcFeedFileObjectKeyData GetInIn) {
    GetIn = GetInIn;
  }

  public void translateFromMap() {
    GetIn = CtcFeedFileObjectKeyHelper.fromMap(inputMap, "CtcFeedFile");
  }

/**
 *
 * Gets the CtcFeedFile
 * @return Value of the CtcFeedFile
 *
 */

  public CtcFeedFileObjectKeyData getCtcFeedFile( ) {
    return GetIn;
  }

}
