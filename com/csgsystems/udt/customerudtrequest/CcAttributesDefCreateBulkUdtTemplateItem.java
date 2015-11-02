/*
 * Generated code DO NOT EDIT
 * Generated file: CcAttributesDefCreateBulkUdtTemplateItem.java
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
 * Class used to create a CcAttributesDefCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class CcAttributesDefCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CcAttributesDefObjectData CADcreate_In;
/**
 *
 * Constructor to create a  CcAttributesDefCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CcAttributesDefCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, CcAttributesDefObjectData CADcreate_InIn) {
    super(id, context, "CcAttributesDefCreate");
    CADcreate_In = CADcreate_InIn;
  }

  public void translateToMap() {
    if (CADcreate_In != null) {
      CADcreate_In.resetFlags(true, true);
      addInput("CcAttributesDef", CcAttributesDefObjectHelper.toMap(CADcreate_In, new HashMap(), "CcAttributesDef").get("CcAttributesDef"));
    }
  }


/**
 *
 * Sets the CcAttributesDef
 * @param CADcreate_InIn Value of the CADcreate_In
 *
 */

  public void setCcAttributesDef(CcAttributesDefObjectData CADcreate_InIn) {
    CADcreate_In = CADcreate_InIn;
  }

  public void translateFromMap() {
    CADcreate_In = CcAttributesDefObjectHelper.fromMap(inputMap, "CcAttributesDef");
  }

/**
 *
 * Gets the CcAttributesDef
 * @return Value of the CcAttributesDef
 *
 */

  public CcAttributesDefObjectData getCcAttributesDef( ) {
    return CADcreate_In;
  }

}
