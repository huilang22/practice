/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CcViewAttributesFindBulkUdtTemplateItem.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

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
 * Class used to create a CcViewAttributesFindBulkUdtTemplateItem Bulk Template
 *
 */

public class CcViewAttributesFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CcViewAttributesObjectFilter CVAfind_In;
/**
 *
 * Constructor to create a  CcViewAttributesFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CcViewAttributesFindBulkUdtTemplateItem(String id, BSDMSessionContext context, CcViewAttributesObjectFilter CVAfind_InIn) {
    super(id, context, "CcViewAttributesFind");
    CVAfind_In = CVAfind_InIn;
  }

  public void translateToMap() {
    if (CVAfind_In != null) {
      Integer index =  CVAfind_In.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CcViewAttributes", CcViewAttributesObjectHelper.toMap(CVAfind_In, new HashMap(), "CcViewAttributes").get("CcViewAttributes"));
    }
  }


/**
 *
 * Sets the CcViewAttributes
 * @param CVAfind_InIn Value of the CVAfind_In
 *
 */

  public void setCcViewAttributes(CcViewAttributesObjectFilter CVAfind_InIn) {
    CVAfind_In = CVAfind_InIn;
  }

  public void translateFromMap() {
    CVAfind_In = CcViewAttributesObjectHelper.fromMapFilter(inputMap, "CcViewAttributes");
  }

/**
 *
 * Gets the CcViewAttributes
 * @return Value of the CcViewAttributes
 *
 */

  public CcViewAttributesObjectFilter getCcViewAttributes( ) {
    return CVAfind_In;
  }

}
