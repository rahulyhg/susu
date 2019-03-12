<#--
Licensed to the Apache Software Foundation (ASF) under one
or more contributor license agreements.  See the NOTICE file
distributed with this work for additional information
regarding copyright ownership.  The ASF licenses this file
to you under the Apache License, Version 2.0 (the
"License"); you may not use this file except in compliance
with the License.  You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing,
software distributed under the License is distributed on an
"AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
KIND, either express or implied.  See the License for the
specific language governing permissions and limitations
under the License.
-->
<#-- This file has been modified by Open Source Strategies, Inc. -->

<div class="screenlet-title-bar">
    <#if orderHeader?has_content>
        <div class="boxhead-left">
            ${uiLabelMap.PageTitleLookupBulkAddProduct}
        </div>
    <#else>
        <div class="boxhead-right">
            <a href="<@ofbizUrl>orderentry</@ofbizUrl>" class="lightbuttontext">${uiLabelMap.OrderOrderItems}</a>
        </div>
        <div class="boxhead-left">
            &nbsp;${uiLabelMap.CommonCreate}
            <#if shoppingCart.getOrderType() == "PURCHASE_ORDER">
                ${uiLabelMap.OrderPurchaseOrder}
            <#else>
                ${uiLabelMap.OrderSalesOrder}
            </#if>
        </div>
    </#if>
    <div class="boxhead-fill">&nbsp;</div>
</div>
