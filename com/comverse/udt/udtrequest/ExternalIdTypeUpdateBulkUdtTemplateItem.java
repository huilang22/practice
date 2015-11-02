/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExternalIdTypeUpdateBulkUdtTemplateItem.java
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
 * Class used to create a ExternalIdTypeUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class ExternalIdTypeUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ExternalIdTypeObjectData EITUpdateIn;
/**
 *
 * Constructor to create a  ExternalIdTypeUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ExternalIdTypeUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, ExternalIdTypeObjectData EITUpdateInIn) {
    super(id, context, "ExternalIdTypeUpdate");
    EITUpdateIn = EITUpdateInIn;
  }

  public void translateToMap() {
    if (EITUpdateIn != null) {
      EITUpdateIn.resetFlags(true, true);
      addInput("ExternalIdType", ExternalIdTypeObjectHelper.toMap(EITUpdateIn, new HashMap(), "ExternalIdType").get("ExternalIdType"));
    }
  }


/**
 *
 * Sets the ExternalIdType
 * @param EITUpdateInIn Value of the EITUpdateIn
 *
 */

  public void setExternalIdType(ExternalIdTypeObjectData EITUpdateInIn) {
    EITUpdateIn = EITUpdateInIn;
  }

  public void translateFromMap() {
    EITUpdateIn = ExternalIdTypeObjectHelper.fromMap(inputMap, "ExternalIdType");
  }

/**
 *
 * Gets the ExternalIdType
 * @return Value of the ExternalIdType
 *
 */

  public ExternalIdTypeObjectData getExternalIdType( ) {
    return EITUpdateIn;
  }

}
