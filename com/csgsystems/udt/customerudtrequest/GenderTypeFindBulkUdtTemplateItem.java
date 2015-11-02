/*
 * Generated code DO NOT EDIT
 * Generated file: GenderTypeFindBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * Class used to create a GenderTypeFindBulkUdtTemplateItem Bulk Template
 *
 */

public class GenderTypeFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected GenderTypeObjectFilter GFindIn;
/**
 *
 * Constructor to create a  GenderTypeFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public GenderTypeFindBulkUdtTemplateItem(String id, BSDMSessionContext context, GenderTypeObjectFilter GFindInIn) {
    super(id, context, "GenderTypeFind");
    GFindIn = GFindInIn;
  }

  public void translateToMap() {
    if (GFindIn != null) {
      Integer index =  GFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("GenderType", GenderTypeObjectHelper.toMap(GFindIn, new HashMap(), "GenderType").get("GenderType"));
    }
  }


/**
 *
 * Sets the GenderType
 * @param GFindInIn Value of the GFindIn
 *
 */

  public void setGenderType(GenderTypeObjectFilter GFindInIn) {
    GFindIn = GFindInIn;
  }

  public void translateFromMap() {
    GFindIn = GenderTypeObjectHelper.fromMapFilter(inputMap, "GenderType");
  }

/**
 *
 * Gets the GenderType
 * @return Value of the GenderType
 *
 */

  public GenderTypeObjectFilter getGenderType( ) {
    return GFindIn;
  }

}
