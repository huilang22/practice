/*
 * Generated code DO NOT EDIT
 * Generated file: CcAttributesDefGetBulkUdtTemplateItem.java
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
 * Class used to create a CcAttributesDefGetBulkUdtTemplateItem Bulk Template
 *
 */

public class CcAttributesDefGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CcAttributesDefObjectKeyData CADget_In;
/**
 *
 * Constructor to create a  CcAttributesDefGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CcAttributesDefGetBulkUdtTemplateItem(String id, BSDMSessionContext context, CcAttributesDefObjectKeyData CADget_InIn) {
    super(id, context, "CcAttributesDefGet");
    CADget_In = CADget_InIn;
  }

  public void translateToMap() {
    if (CADget_In != null) {
      CADget_In.resetFlags(true, true);
      addInput("CcAttributesDef", CcAttributesDefObjectKeyHelper.toMap(CADget_In, new HashMap(), "CcAttributesDefObjectKeyData").get("CcAttributesDefObjectKeyData"));
    }
  }


/**
 *
 * Sets the CcAttributesDef
 * @param CADget_InIn Value of the CADget_In
 *
 */

  public void setCcAttributesDef(CcAttributesDefObjectKeyData CADget_InIn) {
    CADget_In = CADget_InIn;
  }

  public void translateFromMap() {
    CADget_In = CcAttributesDefObjectKeyHelper.fromMap(inputMap, "CcAttributesDef");
  }

/**
 *
 * Gets the CcAttributesDef
 * @return Value of the CcAttributesDef
 *
 */

  public CcAttributesDefObjectKeyData getCcAttributesDef( ) {
    return CADget_In;
  }

}
