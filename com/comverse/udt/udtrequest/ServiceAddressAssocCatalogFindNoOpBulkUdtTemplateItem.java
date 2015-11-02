/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceAddressAssocCatalogFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;

/**
 *
 * NoOp class used to simulate a ServiceAddressAssocCatalogFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ServiceAddressAssocCatalogFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ServiceAddressAssocCatalogObjDataList noOpIn;

/**
 *
 * Constructor to create a   ServiceAddressAssocCatalogFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ServiceAddressAssocCatalogFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceAddressAssocCatalogObjDataList noOpInIn) {
    super(id, context, "ServiceAddressAssocCatalogFind");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
          noOpIn.getArray()[i].resetFlags(true, true);
        mapArray[i] = ServiceAddressAssocCatalogObjHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ServiceAddressAssocCatalog", noOpIn);
      }
      addInput("ServiceAddressAssocCatalog", mapList);
    }
  }
/**
 *
 * Sets the  ServiceAddressAssocCatalog
 * @param noOpInIn ServiceAddressAssocCatalogObjDataList to set
 *
 */
  public void setServiceAddressAssocCatalog(ServiceAddressAssocCatalogObjDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ServiceAddressAssocCatalog passed into the constructor
 * @return Simulated response
 *
 */
  public ServiceAddressAssocCatalogObjDataList getServiceAddressAssocCatalog() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ServiceAddressAssocCatalogObjHelper.fromMapList(inputMap, "ServiceAddressAssocCatalogList");
  }
}
