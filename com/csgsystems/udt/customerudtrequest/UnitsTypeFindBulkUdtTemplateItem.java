/*
 * Generated code DO NOT EDIT
 * Generated file: UnitsTypeFindBulkUdtTemplateItem.java
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
 * Class used to create a UnitsTypeFindBulkUdtTemplateItem Bulk Template
 *
 */

public class UnitsTypeFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected UnitsTypeObjectFilter utFindIn;
/**
 *
 * Constructor to create a  UnitsTypeFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public UnitsTypeFindBulkUdtTemplateItem(String id, BSDMSessionContext context, UnitsTypeObjectFilter utFindInIn) {
    super(id, context, "UnitsTypeFind");
    utFindIn = utFindInIn;
  }

  public void translateToMap() {
    if (utFindIn != null) {
      Integer index =  utFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("UnitsType", UnitsTypeObjectHelper.toMap(utFindIn, new HashMap(), "UnitsType").get("UnitsType"));
    }
  }


/**
 *
 * Sets the UnitsType
 * @param utFindInIn Value of the utFindIn
 *
 */

  public void setUnitsType(UnitsTypeObjectFilter utFindInIn) {
    utFindIn = utFindInIn;
  }

  public void translateFromMap() {
    utFindIn = UnitsTypeObjectHelper.fromMapFilter(inputMap, "UnitsType");
  }

/**
 *
 * Gets the UnitsType
 * @return Value of the UnitsType
 *
 */

  public UnitsTypeObjectFilter getUnitsType( ) {
    return utFindIn;
  }

}
