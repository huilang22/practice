/*
 * Generated code DO NOT EDIT
 * Generated file: ExternalIdTypeFindBulkUdtTemplateItem.java
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
 * Class used to create a ExternalIdTypeFindBulkUdtTemplateItem Bulk Template
 *
 */

public class ExternalIdTypeFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ExternalIdTypeObjectFilter EITFindIn;
/**
 *
 * Constructor to create a  ExternalIdTypeFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ExternalIdTypeFindBulkUdtTemplateItem(String id, BSDMSessionContext context, ExternalIdTypeObjectFilter EITFindInIn) {
    super(id, context, "ExternalIdTypeFind");
    EITFindIn = EITFindInIn;
  }

  public void translateToMap() {
    if (EITFindIn != null) {
      Integer index =  EITFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ExternalIdType", ExternalIdTypeObjectHelper.toMap(EITFindIn, new HashMap(), "ExternalIdType").get("ExternalIdType"));
    }
  }


/**
 *
 * Sets the ExternalIdType
 * @param EITFindInIn Value of the EITFindIn
 *
 */

  public void setExternalIdType(ExternalIdTypeObjectFilter EITFindInIn) {
    EITFindIn = EITFindInIn;
  }

  public void translateFromMap() {
    EITFindIn = ExternalIdTypeObjectHelper.fromMapFilter(inputMap, "ExternalIdType");
  }

/**
 *
 * Gets the ExternalIdType
 * @return Value of the ExternalIdType
 *
 */

  public ExternalIdTypeObjectFilter getExternalIdType( ) {
    return EITFindIn;
  }

}
