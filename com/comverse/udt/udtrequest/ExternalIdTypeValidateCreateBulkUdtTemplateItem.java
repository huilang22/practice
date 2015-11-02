/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExternalIdTypeValidateCreateBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;

/**
 *
 * Class used to create a ExternalIdTypeValidateCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class ExternalIdTypeValidateCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ExternalIdTypeObjectData ExternalIdTypeIn;
  protected Integer ServiceInternalId;
  protected Integer ServiceInternalIdResets;
/**
 *
 * Constructor to create a  ExternalIdTypeValidateCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ExternalIdTypeValidateCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, ExternalIdTypeObjectData ExternalIdTypeInIn, Integer ServiceInternalIdIn, Integer ServiceInternalIdResetsIn) {
    super(id, context, "ExternalIdTypeValidateCreate");
    ExternalIdTypeIn = ExternalIdTypeInIn;
    ServiceInternalId = ServiceInternalIdIn;
    ServiceInternalIdResets = ServiceInternalIdResetsIn;
  }

  public void translateToMap() {
    if (ExternalIdTypeIn != null) {
      ExternalIdTypeIn.resetFlags(true, true);
      addInput("ExternalIdTypeValidate", ExternalIdTypeObjectHelper.toMap(ExternalIdTypeIn, new HashMap(), "ExternalIdTypeValidate").get("ExternalIdTypeValidate"));
    }
    if (ServiceInternalId != null) {
      addInput("ServiceInternalId", ServiceInternalId);
    }
    if (ServiceInternalIdResets != null) {
      addInput("ServiceInternalIdResets", ServiceInternalIdResets);
    }
  }


/**
 *
 * Sets the ExternalIdTypeValidate
 * @param ExternalIdTypeInIn Value of the ExternalIdTypeIn
 *
 */

  public void setExternalIdTypeValidate(ExternalIdTypeObjectData ExternalIdTypeInIn) {
    ExternalIdTypeIn = ExternalIdTypeInIn;
  }

/**
 *
 * Sets the ServiceInternalId
 * @param ServiceInternalIdIn Value of the ServiceInternalId
 *
 */

  public void setServiceInternalId(Integer ServiceInternalIdIn) {
    ServiceInternalId = ServiceInternalIdIn;
  }

/**
 *
 * Sets the ServiceInternalIdResets
 * @param ServiceInternalIdResetsIn Value of the ServiceInternalIdResets
 *
 */

  public void setServiceInternalIdResets(Integer ServiceInternalIdResetsIn) {
    ServiceInternalIdResets = ServiceInternalIdResetsIn;
  }

  public void translateFromMap() {
    ExternalIdTypeIn = ExternalIdTypeObjectHelper.fromMap(inputMap, "ExternalIdTypeValidate");
    ServiceInternalId = (Integer)inputMap.get("ServiceInternalId");
    ServiceInternalIdResets = (Integer)inputMap.get("ServiceInternalIdResets");
  }

/**
 *
 * Gets the ExternalIdTypeValidate
 * @return Value of the ExternalIdTypeValidate
 *
 */

  public ExternalIdTypeObjectData getExternalIdTypeValidate( ) {
    return ExternalIdTypeIn;
  }

/**
 *
 * Gets the ServiceInternalId
 * @return Value of the ServiceInternalId
 *
 */

  public Integer getServiceInternalId( ) {
    return ServiceInternalId;
  }

/**
 *
 * Gets the ServiceInternalIdResets
 * @return Value of the ServiceInternalIdResets
 *
 */

  public Integer getServiceInternalIdResets( ) {
    return ServiceInternalIdResets;
  }

}
